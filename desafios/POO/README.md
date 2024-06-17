flowchart TD
    A[IPhone] -->|Turn On| C
    C{Let me touch}
    C -->|Music| D{fa:fa-play-circle Ipod}
    C -->|Phone| E{fa:fa-phone Phone}
    C -->|Internet| F{fa:fa-compass Safary}
    D -->|Play| G[tocar Music]
    D -->|Pause| H[pausar Music]
    D -->|Select| I[selecionarMusica Music]
    E -->|Call| J[ligar]
    E -->|Acept| K[atander Call]
    E -->|Open VoxMail| L[iniciarCorreioVoz]
    F -->|Open| M[exibirPagina Browser]
    F -->|Aba| M[adicionarNovaAba Browser]
    F -->|Refresh| M[atualizarPagina Browser]

    D -->|Home| C
    E -->|Home| C
    F -->|Home| C
