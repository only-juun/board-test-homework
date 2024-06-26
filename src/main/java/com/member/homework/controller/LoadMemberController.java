package com.member.homework.controller;

import com.member.homework.common.BaseResponse;
import com.member.homework.dto.response.MemberDto;
import com.member.homework.service.admin.LoadMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LoadMemberController {

    private final LoadMemberService loadMemberService;

    @GetMapping("/api/admin/users")
    public ResponseEntity<BaseResponse<List<MemberDto>>> loadAllMembers() {
        return ResponseEntity.ok(
                BaseResponse.ok(loadMemberService.loadAllMembers())
        );
    }
}
