## Conceito de POO ##

### Baixo e Alto Nível ###
- **Baixo Nível**: Próximo da máquina, mais difícil de programar.
    - **Assembly**: Linguagem de baixo nível.
    - **C**: Linguagem de baixo nível.
    - **C++**: Linguagem de baixo nível.
- **Alto Nível**: Próximo do humano, mais fácil de programar.
    - **Python**: Linguagem de alto nível.
    - **Java**: Linguagem de alto nível.
    - **C#**: Linguagem de alto nível.

Exemplo de código em **Assembly**:
```assembly
mov eax, 1
add eax, 1
```
Mesmo código em **Python**:
```python
a = 1
a += 1
```

### Programação Estruturada ###

Paradigma que utiliza a estrutura de sequência, seleção e repetição.
Foco em funções e procedimentos.

Exemplo de código em **C**:
```c
#include <stdio.h>

int main() {
    int a = 1;
    a += 1;
    printf("%d", a);
    return 0;
}
```

### Programação Orientada a Objetos ###

Paradigma que utiliza a estrutura de classes e objetos.
Foco em atributos e métodos.

Exemplo de código em **Python**:
```python

class Pessoa:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

    def falar(self):
        print(f"{self.nome} está falando.")

    p = Pessoa("João", 20)
    p.falar()
```


