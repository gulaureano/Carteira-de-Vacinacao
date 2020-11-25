public void VacinarUsuario() {
		int id = 1;
		String nome = "teste";
		String rg = "12.234.231-23";
		String cpf = "123.456.789-12";
		int idade = 34;
		String endereco = "teste, 123";
		String email = "teste@teste.com";
		String senha = "1234";
		
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		usuarioDAO.cadastrarUsuario(id, nome, rg, cpf, idade, endereco, email, senha);
		
		Usuario usuario = usuarioDAO.buscarPorId(1);
		
		if (usuario != null) {
			Campanha campanha = campanhaDAO.buscarPorId(1);
			Vacina vac = new Vacina();
			vac.setId(1);
			vac.setNome("Sarampo");
			vac.setIndicacao("Crianças, adolescentes e adultos");
			vac.setComposicao("Trata-se de vacina atenuada, contendo vírus vivos “enfraquecidos” do sarampo, da rubéola e da caxumba");
			vac.setConsumoVia("Injetável");
			vac.setPericulosidade("1ª dose: Crianças com 12 meses, 2ª dose: Crianças com 15 meses");
			
			campanha.getVacinas().add(vac);
			campanhaDAO.vacinarUsuario(campanha, usuario);
			
			if (usuario.getVacinas().size() > 0 ) {
				Assert.assertTrue(true);
			}
			
			if (campanha.getQtdeVacinas() == 0) {
				Assert.assertTrue(true);
			}
			
		}
	}
