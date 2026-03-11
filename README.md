# Lista de Exercícios — Herança em Java

## 1️⃣ Exercício básico — Pessoa

Crie uma classe:

**Classe Pessoa**

- nome
- idade

Método:

- `exibirDados()`

Agora crie duas classes que **herdam de Pessoa**:

**Classe Aluno**

- matricula

**Classe Professor**

- disciplina

No `main`:

- Crie um aluno
- Crie um professor
- Mostre os dados usando `exibirDados()`

---

# 2️⃣ Exercício — Funcionários

Crie a classe:

**Funcionario**

- nome
- salario

Método:

- `calcularBonus()`

Crie duas subclasses:

**Gerente**

- bonus = 20% do salário

**Desenvolvedor**

- bonus = 10% do salário

No `main`:

- crie um gerente
- crie um desenvolvedor
- imprima o bônus de cada um.

---

# 3️⃣ Exercício — Veículos 🚗

Crie a classe:

**Veiculo**

- marca
- modelo
- ano

Método:

- `exibirInfo()`

Subclasses:

**Carro**

- quantidadePortas

**Moto**

- cilindradas

Mostre as informações completas no `main`.

---

# 4️⃣ Exercício — Conta Bancária (muito usado em entrevistas) 💰

Classe base:

**Conta**

- numeroConta
- saldo

Métodos:

- `depositar()`
- `sacar()`

Subclasses:

**ContaCorrente**

- taxaSaque

**ContaPoupanca**

- rendimento

No `main`:

- crie uma conta corrente
- crie uma conta poupança
- faça operações de saque e depósito.

---

# 5️⃣ Exercício — Sistema de Animais 🐶

Classe base:

**Animal**

- nome
- idade

Método:

- `emitirSom()`

Subclasses:

**Cachorro**

- emitirSom → "Latido"

**Gato**

- emitirSom → "Miau"

No `main`:

- crie um cachorro
- crie um gato
- chame `emitirSom()`.

---

# 6️⃣ Exercício — Loja (nível mais real) 🛒

Classe base:

**Produto**

- nome
- preco

Método:

- `exibirProduto()`

Subclasses:

**Eletronico**

- garantiaMeses

**Alimento**

- dataValidade

No `main`:

- crie produtos dos dois tipos
- mostre as informações.

---

# 7️⃣ Exercício DESAFIO 🧠

Crie uma hierarquia:

```
Usuario
   |
   |-- Cliente
   |
   |-- Administrador
```

**Usuario**

- nome
- email

**Cliente**

- historicoCompras (List)

**Administrador**

- nivelAcesso

Crie métodos para:

- exibir informações
- adicionar compra ao cliente.
