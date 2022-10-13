package com.zerobase.fastlms.banner.model;

import lombok.Data;

import java.time.LocalDate;


@Data
public class BannerInput {
    Long id;

    String altText; // 대체 텍스트
    String linkBanner; // 배너링크
    String targetInfo; // 타겟 인포
    int sortNum;
    boolean frontYn;

    String fileName;
    String urlFilename;

    //삭제를 위한
    String idList;
}
