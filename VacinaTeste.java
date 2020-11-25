public class VacinaTeste {
	
	private CampanhaDAO campanhaDAO; 
	
	public VacinaTeste() {
		this.campanhaDAO = new CampanhaDAO();
		this.campanhaDAO.construirCampanha();
  }

  	@Test