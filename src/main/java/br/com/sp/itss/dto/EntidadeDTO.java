package br.com.sp.itss.dto;

public class EntidadeDTO implements BaseDTO {

	private Long id;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

}
