package com.sy.side.cms.controller;

import com.sy.side.cms.dto.request.NoticeDto;
import com.sy.side.cms.service.NoticeService;
import com.sy.side.common.entity.page.Page;
import com.sy.side.common.entity.page.Pagination;
import com.sy.side.common.entity.page.RequestPage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/cms")
public class CmsController {

    private final NoticeService noticeService;

    @GetMapping("notice")
    public Page<NoticeDto> notice(Pagination pagination) {
        RequestPage<NoticeDto> requestPage = RequestPage.<NoticeDto>builder()
                .pagination(pagination)
                .build();
        return this.noticeService.getNoticeList(requestPage);
    }
}
