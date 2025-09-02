package com.example.pratica_devops;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AlunoTest {

    @Test
    void dadoAlunoComPremiumAtivo_quandoCursandoModuloValido_entaoDeveSerElegivel() {
    	//Arrange -> Criação do objeto Aluno com o estado necessário para o teste (premium ativo)
        Aluno aluno = new Aluno(true);
        // Act -> Invocação do método que queremos testar
        boolean elegivel = aluno.isElegivelParaProjetosReais();
        // Assert -> Verifica se o resultado obtido (elegivel) é igual ao esperado (true)
        assertTrue(elegivel, "Aluno com premium deveria ser elegível para projetos reais.");
    }

    @Test
    void dadoAlunoSemPremium_quandoCursandoModuloValido_entaoNaoDeveSerElegivel() {
    	//Arrange -> Criação do objeto Aluno com o estado necessário para o teste (premium inativo)
        Aluno aluno = new Aluno(false);
        // Act -> Invocação do método que queremos testar
        boolean elegivel = aluno.isElegivelParaProjetosReais();
     // Assert -> Verifica se o resultado obtido (elegivel) é igual ao esperado (false)
        assertFalse(elegivel, "Aluno sem premium não deveria ser elegível para projetos reais.");
    }
}
