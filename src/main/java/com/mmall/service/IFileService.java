package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

public interface IFileService {

    String upload(MultipartFile MultiFile, String path);
}
