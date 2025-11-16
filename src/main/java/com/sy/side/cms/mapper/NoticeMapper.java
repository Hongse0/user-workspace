package com.sy.side.cms.mapper;

import com.sy.side.cms.dto.request.NoticeDto;
import com.sy.side.cms.entity.Notice;
import com.sy.side.common.entity.page.RequestPage;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoticeMapper {

    int selectNoticeCnt();

    List<Notice> selectNoticeList(RequestPage<NoticeDto> requestPage);
}
