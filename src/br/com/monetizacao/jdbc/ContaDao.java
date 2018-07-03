package br.com.monetizacao.jdbc;

import java.sql.PreparedStatement;

public class ContaDao {
	
	public void insert(br.com.monetizacao.entidades.Conta conta) {

		String sql = "INSERT INTO Conta (numero, saldo) values (?, ?)";

		try {

			PreparedStatement ps = ConnectionDB.getConexao().prepareStatement(sql);
			ps.setInt(1, conta.getNumero());
			ps.setDouble(2, conta.getSaldo());

			ps.execute();
			ps.close();

		} catch (Exception e) {
			System.out.println("Não foi possivel adicionar uma nova conta, verifique os dados");
			e.printStackTrace();
		}

	}


}
