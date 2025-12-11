/**
 * Archivo: src/main/resources/static/js/main.js
 * Función: Inicializar DataTables y otros scripts de la página
 */

$(document).ready(function() {
    
    // ==========================================================
    // 1. INICIALIZACIÓN DE DATATABLES
    // ==========================================================
    
    if ($('#tabla-ofertas').length) {
        // Inicializa DataTables solo si el elemento con ID 'tabla-ofertas' existe
        $('#tabla-ofertas').DataTable({
            // Configuración básica para DataTables
            paging: true,            // Habilitar paginación
            searching: true,         // Habilitar búsqueda global
            info: true,              // Mostrar información de registros
            
            // Opciones de estilo Bootstrap
            responsive: true,
            
            // Personalización de idioma (muy importante para español)
            language: {
                // Puedes usar el URL directo al archivo JSON de DataTables
                url: '//cdn.datatables.net/plug-ins/2.0.8/i18n/es-ES.json' 
            },
            
            // Opcional: Cambiar el orden de los elementos (botones, búsqueda, info, paginación)
            // 'l' length-change, 'f' filtering, 't' table, 'i' info, 'p' pagination, 'r' processing
            dom: '<"row"<"col-sm-12 col-md-6"l><"col-sm-12 col-md-6"f>><"row"<"col-sm-12"tr>><"row"<"col-sm-12 col-md-5"i><"col-sm-12 col-md-7"p>>',
        });
    }

    // ==========================================================
    // 2. OTROS SCRIPTS (Ej. lógica de filtros, popovers, etc.)
    // ==========================================================
    
    // Ejemplo: Inicializar Tooltips de Bootstrap
    var tooltipTriggerList = [].slice.call(document.querySelectorAll('[data-bs-toggle="tooltip"]'))
    var tooltipList = tooltipTriggerList.map(function (tooltipTriggerEl) {
      return new bootstrap.Tooltip(tooltipTriggerEl)
    })
});