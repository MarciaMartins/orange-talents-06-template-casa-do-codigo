package br.com.zypacademy.casaDoCodigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zypacademy.casaDoCodigo.model.pagamento.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}