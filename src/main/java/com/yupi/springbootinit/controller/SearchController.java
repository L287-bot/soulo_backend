package com.yupi.springbootinit.controller;


import com.yupi.springbootinit.common.BaseResponse;
import com.yupi.springbootinit.common.ResultUtils;
import com.yupi.springbootinit.manager.SearchFacade;
import com.yupi.springbootinit.model.dto.search.SearchRequest;
import com.yupi.springbootinit.model.vo.SearchVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.ExecutionException;

/**
 * 聚合搜索接口
 *
 * 
 */
@RestController
@RequestMapping("/search")
@Slf4j
public class SearchController {

//    @Resource
//    private UserService userService;
//
//    @Resource
//    private PostService postService;
//
//    @Resource
//    private PictureService pictureService;

    @Resource
    private SearchFacade searchFacade;


    @PostMapping("/all")
    public BaseResponse<SearchVO> searchAll(@RequestBody SearchRequest searchRequest, HttpServletRequest request) throws ExecutionException, InterruptedException {

        return ResultUtils.success(searchFacade.searchAll(searchRequest, request));


        // 图片
//        Page<Picture> picturePage = pictureService.searchPicture(searchText, 1, 10);

        //        // 用户
//        UserQueryRequest userQueryRequest = new UserQueryRequest();
//        userQueryRequest.setUserName(searchText);
//        Page<UserVO> userVOPage = userService.listUserVOByPage(userQueryRequest);
//
//        // 文章
//        PostQueryRequest postQueryRequest = new PostQueryRequest();
//        postQueryRequest.setSearchText(searchText);
//        Page<PostVO> postVOPage = postService.listPostVOByPage(postQueryRequest, request);
//
//


    }

}
