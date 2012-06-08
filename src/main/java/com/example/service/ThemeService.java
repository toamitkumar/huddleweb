package com.example.service;


import java.util.List;

import com.example.model.Theme;

public interface ThemeService {
    
    public List<Theme> allThemes();
    public Theme getThemeById(int theme);
}
