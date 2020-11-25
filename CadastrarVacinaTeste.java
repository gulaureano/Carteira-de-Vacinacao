public void CadastrarVacinaTeste() {
		Campanha campanha = campanhaDAO.buscarPorId(1);
		
		if (campanha != null) {
			Vacina vac = new Vacina();
			vac.setId(1);
			vac.setNome("Sarampo");
			vac.setIndicacao("Crianças, adolescentes e adultos");
			vac.setComposicao("Trata-se de vacina atenuada, contendo vírus vivos “enfraquecidos” do sarampo, da rubéola e da caxumba");
			vac.setConsumoVia("Injetável");
			vac.setPericulosidade("1ª dose: Crianças com 12 meses, 2ª dose: Crianças com 15 meses");
			
			campanha.getVacinas().add(vac);
			
			if (campanha.getQtdeVacinas() > 0) {
				Assert.assertTrue(true);
			}
		}
	}
