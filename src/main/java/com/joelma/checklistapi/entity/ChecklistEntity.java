package com.joelma.checklistapi.entity;

public class ChecklistEntity extends BaseEntity{
    private Long checklistIdItem;

    private String descricao;

    private boolean completo;

    private LocalTime deadLine;

    private LocalTime postedDate;

    private categoriaEntity categoria;


}
