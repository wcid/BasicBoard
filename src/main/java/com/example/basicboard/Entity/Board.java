package com.example.basicboard.Entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDateTime;


@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "board")
public class Board implements Serializable {

    @Builder
    public Board(String subject, String contents, String writer, String hashedPassword) {
        this.subject = subject;
        this.contents = contents;
        this.writer = writer;
        this.hashedPassword = hashedPassword;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "subject", nullable = false, length = 100)
    private String subject;

    @Column(name = "contents", nullable = false, length = 512)
    private String contents;

    @Column(name = "writer", nullable = false, length = 32)
    private String writer;

    @Column(name = "hashedPassword", nullable = false, length = 256)
    private String hashedPassword;

    @Column(name = "creationDateTime")
    @CreationTimestamp
    private LocalDateTime creationDateTime;

    @Column(name = "modificationDateTime")
    @UpdateTimestamp
    private LocalDateTime modificationDateTime;
}
