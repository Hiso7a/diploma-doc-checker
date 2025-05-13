package com.example.formatchecker.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/check")
public class FormatCheckController {

    @PostMapping("/upload")
    public String checkFormat(@RequestParam("file") MultipartFile file) {
        // Простая заглушка проверки
        if (file.getOriginalFilename().endsWith(".docx") || file.getOriginalFilename().endsWith(".pdf")) {
            return "Файл принят. Проверка в процессе...";
        } else {
            return "Неверный формат файла. Принимаются только DOCX или PDF.";
        }
    }
}
