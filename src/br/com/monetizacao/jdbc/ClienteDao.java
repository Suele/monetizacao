package br.com.monetizacao.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.monetizacao.entidades.Cliente;

public class ClienteDao {

	public void insert(br.com.monetizacao.entidades.Cliente cliente) {

		String sql = "INSERT INTO Cliente (nome, cpf, email) values (?, ?, ?)";

		try {

			PreparedStatement ps = ConnectionDB.getConexao().prepareStatement(sql);
			ps.setString(1, cliente.getNome());
			ps.setString(2, cliente.getCpf());
			ps.setString(3, cliente.getEmail());

			ps.execute();
			ps.close();

		} catch (Exception e) {
			System.out.println("Não foi possivel adicionar um novo usuario, verifique os dados");
			e.printStackTrace();
		}

	}

	public void select() {
		String sql = "SELECT * FROM cliente";

		try {

			PreparedStatement ps = ConnectionDB.getConexao().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				String resultadoDaPesquisa = " Nome: " + rs.getString("nome") + "  " +
						                     " CPF: " + rs.getString("cpf") + "  " +
				                             " Email: " + rs.getString("email") + "  ";
				System.out.println(resultadoDaPesquisa);
			}

		} catch (Exception e) {
			System.out.println("Não foi possivel ");
			System.out.checkError();
		}
	}
	
	public void delete(Cliente cliente) {
		
		String sql = "DELETE FROM cliente WHERE id = ?";
		
		try {
			PreparedStatement ps = ConnectionDB.getConexao().prepareStatement(sql);
			ps.setLong(1, cliente.getId());
			ps.execute();
			ps.close();
		} catch (Exception e) {
			System.out.println("Não foi possivel excluir o cliente selecionado");
			e.printStackTrace();
		}
		
	}
}
