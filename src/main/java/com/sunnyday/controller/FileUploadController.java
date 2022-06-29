package com.sunnyday.controller;


import com.sunnyday.domain.Student;
import com.sunnyday.service.FileUploadService;
import com.sunnyday.util.CsvUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


/**
 * test
 *
 * @author sunnyday
 * @date 2021/7/21 10:01
 */
@RestController
@RequestMapping("/student")
public class FileUploadController {

    public static void main(String[] args) {
    }

    @Autowired
    private FileUploadService fileUploadService;

    private static final ExecutorService POOL = new ThreadPoolExecutor(6,
            10,
            0L,
            TimeUnit.MILLISECONDS,
            new LinkedBlockingQueue<>(), new ThreadPoolExecutor.CallerRunsPolicy());

    @GetMapping
    public String test(@RequestParam(value = "str", required = false) String str) {
        return "Hello world";
    }

    @GetMapping("list")
    public List<Student> list() {
        return fileUploadService.list();
    }

    @GetMapping("/{id}")
    public Student detail(@PathVariable(value = "id") String id) {
        return fileUploadService.selectById(id);
    }

    @PostMapping
    public int add(@RequestBody Student student) {
        return fileUploadService.insert(student);
    }

    @PutMapping
    public int update(@RequestBody Student student) {
        return fileUploadService.update(student);
    }

    @DeleteMapping
    public int delete(@RequestParam(value = "id") String id) {
        return fileUploadService.delete(id);
    }

    @PostMapping(value = "/upload", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public void test(@RequestParam("file1") MultipartFile file1, @RequestParam("file2") MultipartFile file2) {

        CsvUtil.readCSVFile(file1, Object.class);

        POOL.execute(() -> {
            try {
                Thread.sleep(50000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            CsvUtil.readCSVFile(file2, Object.class);

        });
        System.out.println("finish");
    }

    /*public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册驱动 加载到内存 字节码结构信息 可以自动加载
        // 使用到该类，执行了其静态代码块（代码块中进行了注册）mysql5 之后可以省略注册驱动的步骤。在jar包中，存在一个java.sql.Driver配置文件，文件中指定了com.mysql.jdbc.Driver
        Class.forName("org.postgresql.Driver");

        //创建连接
        // jdbc:mysql: 数据交互 解析规则
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/test", "postgres", "admin");

        //获取语句对象
        Statement statement = connection.createStatement();

        //要执行的语句对象
        String sql = "select 1";

        //获取执行结果
        ResultSet resultSet1 = statement.executeQuery(sql);

        //处理结果
        while (resultSet1.next()) {
            System.out.println(resultSet1.toString());
        }

        //释放资源
        resultSet1.close();
        statement.close();
        connection.close();
    }*/

}