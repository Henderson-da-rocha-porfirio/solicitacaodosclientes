INSERT INTO solicitacao (id, tipo, descricao, status) VALUES
(1, 'CARTOES', 'Problemas com cartão', 'ABERTA'),
(2, 'EMPRESTIMOS', 'Contratação de empréstimo', 'ABERTA'),
(3, 'OUTROS_ASSUNTOS', 'Dúvida sobre serviços', 'ABERTA');

INSERT INTO atendente (id, nome, time, capacidade_maxima, capacidade_atual) VALUES
(1, 'João', 'CARTOES', 3, 0),
(2, 'Maria', 'EMPRESTIMOS', 3, 0),
(3, 'Pedro', 'OUTROS_ASSUNTOS', 3, 0);