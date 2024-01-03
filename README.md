#Como configurar o Eclipse para trabalho com o repositório GitHub
  Parte 1 - Configurar o nome do usuário e e-mail para commits
    Abrir o Eclipse, clicar no menu Window, em seguida clicar no menu Preferences, em seguida filtrar pelo opção "Git", depois clicar na opção "Configuration", em seguida na aba "User Settings" configurar a propriedade "user.name" com o seu nome de usuário do GitHub e a propriedade "user.email" com a senha do GitHub.
    
##Parte 2 - Configurar no repositório um outro Usuário GitHub como colaborador
Acessar GitHub e acessar o repositório clicar em Settings > Collaborators >Add people, em seguida colocar o nome de usuário do GitHub do novo colaborador.
Em seguida o novo colaborador tem que aceitar o convite.
    
##Parte 3 - Configuração do token no GitHub
As configurações do link a seguir devem ser feitas no repositório GitHub **DO USUÁRIO QUE VAI REALIZAR O COMMIT, NÃO NO GitHub QUE CONTÉM O REPOSITÓRIO**;
	
  Link de referência: "https://docs.github.com/pt/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens#como-criar-um-personal-access-token-classic"
  
    
##Parte 4 - Configuração do token no Eclipse
  Link de referência: "https://stackoverflow.com/questions/30421875/cant-connect-to-any-uri-error-while-commiting-code-from-eclipse-to-git-reposito"

##Reprodução do passo 5;    
  In your Eclipse Editor, Right click on your project -> Team -> Remote -> Configure Push to Upstream
