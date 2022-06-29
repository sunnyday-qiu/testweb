package com.sunnyday.util;

import com.opencsv.bean.CsvToBeanBuilder;
import lombok.SneakyThrows;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class CsvUtil {
    @SneakyThrows
    public static <T> List<T> readCSVFile(MultipartFile file, Class<T> t) {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            return new CsvToBeanBuilder<T>(bufferedReader)
                    .withType(t)
                    .build()
                    .parse();
        } catch (Exception e) {
            throw new RuntimeException("read file error", e);
        }
    }

}
