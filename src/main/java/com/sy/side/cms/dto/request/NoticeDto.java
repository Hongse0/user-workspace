package com.sy.side.cms.dto.request;

import java.time.LocalDateTime;
import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NoticeDto {
    private Long noticeId;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String deleteYn;
}
