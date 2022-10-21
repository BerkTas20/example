package com.example.example.controller;

import com.example.example.entities.Like;
import com.example.example.requests.LikeCreateRequest;
import com.example.example.responses.LikeResponse;
import com.example.example.services.LikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("likes")
@RequiredArgsConstructor
public class LikeController {
    private final LikeService likeService;


}
