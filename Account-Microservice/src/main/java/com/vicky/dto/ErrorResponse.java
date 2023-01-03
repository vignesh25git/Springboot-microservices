package com.vicky.dto;

import java.time.LocalDateTime;
import java.util.List;
import org.springframework.http.HttpStatus;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class ErrorResponse {

	private HttpStatus status;
	private Integer code;
	private String message;
	private List<String> errorDetails;
	private LocalDateTime timeStamp;

}
