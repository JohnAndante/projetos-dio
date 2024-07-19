# Primeiro Controller

## REST Controller

Um **REST Controller** em Spring é uma classe contendo anotações específicas para a disponibilização de recursos HTTPs baseados em nossos serviços e regras de negócio.

Anotações e configurações mais comuns em um **REST Controller**:

- `@RestController`: Responsável por designar o bean de component que suporta requisições HTTP com base na arquitetura REST.
- `@RequestMapping`("prefix"): Determina qual a URI comum para todos os recursos disponibilizados pelo **Controller**
- `@GetMapping`, `@PostMapping`, `@PutMapping`, `@DeleteMapping`: Anotações que definem os métodos HTTP que serão utilizados para acessar os recursos.
- `@PathVariable`: Anotação que mapeia variáveis de URI para parâmetros de métodos.
- `@RequestBody`: Anotação que mapeia o corpo da requisição para um objeto.
- `@RequestParam`: Anotação que mapeia parâmetros de requisição para parâmetros de métodos.

### Exemplo

```java
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> listarUsuarios() {
        return usuarioService.listarUsuarios();
    }

    @GetMapping("/{id}")
    public Usuario buscarUsuarioPorId(@PathVariable Long id) {
        return usuarioService.buscarUsuarioPorId(id);
    }

    @PostMapping
    public Usuario salvarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.salvarUsuario(usuario);
    }

    @PutMapping("/{id}")
    public Usuario atualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        return usuarioService.atualizarUsuario(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Long id) {
        usuarioService.deletarUsuario(id);
    }
}
```




