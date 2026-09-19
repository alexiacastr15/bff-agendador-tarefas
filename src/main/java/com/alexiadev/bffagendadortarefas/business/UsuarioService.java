package com.alexiadev.bffagendadortarefas.business;

import com.alexiadev.bffagendadortarefas.business.dto.in.EnderecoDTORequest;
import com.alexiadev.bffagendadortarefas.business.dto.in.LoginDTORequest;
import com.alexiadev.bffagendadortarefas.business.dto.in.TelefoneDTORequest;
import com.alexiadev.bffagendadortarefas.business.dto.in.UsuarioDTORequest;
import com.alexiadev.bffagendadortarefas.business.dto.out.EnderecoDTOResponse;
import com.alexiadev.bffagendadortarefas.business.dto.out.TelefoneDTOResponse;
import com.alexiadev.bffagendadortarefas.business.dto.out.UsuarioDTOResponse;
import com.alexiadev.bffagendadortarefas.infrastructure.client.UsuarioClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class UsuarioService {
    private final UsuarioClient usuarioClient;

    public UsuarioDTOResponse salvaUsuario(UsuarioDTORequest usuarioDTO){
       return usuarioClient.salvaUsuario(usuarioDTO);
    }

    public String loginUsuario(LoginDTORequest usuarioDTO){
        return usuarioClient.login(usuarioDTO);
    }

    public UsuarioDTOResponse buscarUsuarioPorEmail(String email, String token){
        return usuarioClient.buscaUsuarioPorEmail(email, token);
    }

    public void deletaUsuarioPorEmail(String email, String token){
        usuarioClient.deletaUsuarioPorEmail(email, token);
    }

    public UsuarioDTOResponse atualizaDadosUsuario(String token, UsuarioDTORequest dto){
        return usuarioClient.atualizaDadoUsuario(dto, token);
    }

    public EnderecoDTOResponse atulizaEndereco(Long idEndereco, EnderecoDTORequest enderecoDTO, String token){
        return usuarioClient.atualizaEndereco(enderecoDTO, idEndereco, token);
    }

    public TelefoneDTOResponse atualizaTelefone(Long idTelefone, TelefoneDTORequest dto, String token){
        return usuarioClient.atualizaTelefone(dto, idTelefone, token);
    }

    public EnderecoDTOResponse cadastraEndereco(String token, EnderecoDTORequest dto){
        return usuarioClient.cadastraEndereco(dto, token);
    }

    public TelefoneDTOResponse cadastraTelefone(String token, TelefoneDTORequest dto){
        return usuarioClient.cadastraTelefone(dto, token);

    }
}
