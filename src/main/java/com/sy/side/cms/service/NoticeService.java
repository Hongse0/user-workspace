package com.sy.side.cms.service;

import com.sy.side.cms.mapper.NoticeMapper;
import com.sy.side.cms.dto.request.NoticeDto;
import com.sy.side.cms.entity.Notice;
import com.sy.side.common.entity.page.Page;
import com.sy.side.common.entity.page.Pagination;
import com.sy.side.common.entity.page.RequestPage;
import com.sy.side.common.error.ErrorCodeImpl;
import com.sy.side.common.exception.BizException;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class NoticeService {

    private final NoticeMapper noticeMapper;

    public Page<NoticeDto> getNoticeList(RequestPage<NoticeDto> requestPage) {
        Pagination pagination = requestPage.getPagination();
        int serviceCnt = this.noticeMapper.selectNoticeCnt();

        if(serviceCnt == 0) {
            throw new BizException(ErrorCodeImpl.INTERNAL_SERVER_ERROR);
        }

        pagination.setTotal(serviceCnt);

        List<Notice> getList = this.noticeMapper.selectNoticeList(requestPage);

        List<NoticeDto> result = getList.stream()
                .map(notice -> NoticeDto.builder()
                        .noticeId(notice.getNoticeId())
                        .title(notice.getTitle())
                        .content(notice.getContent())
                        .build())
                .toList();

        return Page.<NoticeDto>builder()
                .list(result)
                .pagination(pagination)
                .build();
    }
}
