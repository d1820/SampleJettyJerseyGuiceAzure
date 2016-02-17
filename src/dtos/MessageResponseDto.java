package dtos;

import java.util.Date;

public class MessageResponseDto {
	public String StatusCode;
	public Date SentDateTime;
	
	public MessageResponseDto(String status, Date sentDate) {		
		StatusCode = status;
		SentDateTime = sentDate;
	}

}