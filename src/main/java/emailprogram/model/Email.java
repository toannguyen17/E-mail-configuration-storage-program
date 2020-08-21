package emailprogram.model;

import java.time.LocalDateTime;

public class Email {
    private Long id;
    private String  languages;
    private String  page_size;
    private Boolean filter;
    private String  signature;

    public Email(){
    }

    public Email(String languages, String page_size, Boolean filter, String signature) {
        this.languages = languages;
        this.page_size = page_size;
        this.filter = filter;
        this.signature = signature;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getPage_size() {
        return page_size;
    }

    public void setPage_size(String page_size) {
        this.page_size = page_size;
    }

    public Boolean getFilter() {
        return filter;
    }

    public void setFilter(Boolean filter) {
        this.filter = filter;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
