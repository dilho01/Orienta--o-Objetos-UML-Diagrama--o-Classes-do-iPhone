package Função.Implements;

import Função.Musical.MusicaImplems;
import Função.Navegador.NavegadorImplems;
import Função.Telefonico.TelefoneImplems;

public class Implementos  implements MusicaImplems, NavegadorImplems, TelefoneImplems{
    public void Tocar(){
        System.out.println("via implementos");
    }
    public void Pausar(){
    System.out.println("via implementos");
    }
    public void SelecioneMusica(){
        System.out.println("via implementos");
    }

   public void exibirPagina(){
    System.out.println("via implementos");
   }
    public void adicionarNovaAba(){
     System.out.println("via implementos");
    }
    public void atualizarPagina(){
         System.out.println("via implementos");
    }

    public void ligar(){
    System.out.println("via implementos");
    }
    public void atender(){
    System.out.println("via implementos");
    }
    public void iniciarCorrerioVoz(){
         System.out.println("via implementos");
    }

}
