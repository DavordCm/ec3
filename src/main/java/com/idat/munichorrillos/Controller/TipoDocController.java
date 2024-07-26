package com.idat.munichorrillos.Controller;

import com.idat.munichorrillos.Model.bd.Area;
import com.idat.munichorrillos.Model.bd.TipoDoc;
import com.idat.munichorrillos.Services.AreaService;
import com.idat.munichorrillos.Services.TipoDocService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@AllArgsConstructor
@Controller
@RequestMapping("/tipodoc")
public class TipoDocController {

    private TipoDocService tipoDocService;

    @GetMapping("/listar")
    public String listarTipoDoc(Model model){
        model.addAttribute("tipos",tipoDocService.listarTipo());
        return "tipodoc/listar";
    }

    @GetMapping("/agregar")
    public String agregarTipo(Model model) {
        model.addAttribute("tipos",new TipoDoc());
        return "/tipodoc/agregarTipoDoc";
    }

    @PostMapping("/guardarArea")
    public String guardarTipo(@Validated TipoDoc tipoDoc, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "/tipodoc/agregarTipoDoc";
        }
        tipoDocService.guardarTipo(tipoDoc);
        return "redirect:/tipodoc/listar";  // redirigir a la lista de personas
    }
    @GetMapping("/editar/{id}")
    public String editarArea(@PathVariable Integer id, Model model) {
        TipoDoc tipoDoc = tipoDocService.obtenerTipo(id);
        model.addAttribute("tipos", tipoDoc);
        return "/tipodoc/editarTipoDoc";  // nombre de la vista (archivo HTML)
    }
}
