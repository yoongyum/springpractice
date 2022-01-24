package com.example.demo.board.domain.entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class File { //데이터베이스에 쓰일 파일 객체
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String origFilename; //파일의 실제 이름

    @Column(nullable = false)
    private String filename;    //서버에 저장될 파일명

    @Column(nullable = false)
    private String filePath;    //파일 경로

    @Builder
    public File(Long id, String origFilename, String filename, String filePath){
        this.id = id;
        this.origFilename = origFilename;
        this.filename = filename;
        this.filePath = filePath;
    }
}
