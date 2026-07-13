package com.university.cleaningInventory.view.themes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class AppTheme {
    
    // ===== PRIMARY COLORS - PURPLE THEME =====
    public static final Color PRIMARY = new Color(108, 99, 255);
    public static final Color PRIMARY_DARK = new Color(90, 82, 213);
    public static final Color PRIMARY_LIGHT = new Color(139, 131, 255);
    
    // ===== BACKGROUND COLORS - DARK GREY THEME =====
    public static final Color MAIN_BG = new Color(45, 45, 45);
    public static final Color SECONDARY_BG = new Color(61, 61, 61);
    public static final Color TERTIARY_BG = new Color(74, 74, 74);
    
    // ===== STATUS COLORS =====
    public static final Color SUCCESS = new Color(76, 175, 80);
    public static final Color DANGER = new Color(244, 67, 54);
    public static final Color WARNING = new Color(255, 193, 7);
    
    // ===== TEXT COLORS =====
    public static final Color TEXT_PRIMARY = Color.WHITE;
    public static final Color TEXT_SECONDARY = new Color(176, 176, 176);
    public static final Color TEXT_LIGHT = new Color(224, 224, 224);
    
    // ===== BORDER COLORS =====
    public static final Color BORDER_LIGHT = new Color(80, 80, 80);
    
    // ===== FONTS =====
    public static final Font HEADER_FONT = new Font("Segoe UI", Font.BOLD, 28);
    public static final Font SUBHEADER_FONT = new Font("Segoe UI", Font.BOLD, 20);
    public static final Font BODY_FONT = new Font("Segoe UI", Font.PLAIN, 14);
    public static final Font BUTTON_FONT = new Font("Segoe UI", Font.BOLD, 14);
    
    // ===== BORDERS =====
    public static final Border CARD_BORDER = BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(BORDER_LIGHT),
        BorderFactory.createEmptyBorder(20, 20, 20, 20)
    );
    
    public static final Border INPUT_BORDER = BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(BORDER_LIGHT),
        BorderFactory.createEmptyBorder(8, 12, 8, 12)
    );
    
    // ===== STYLING METHODS =====
    
    // Style a standard JButton with rounded corners
    public static void styleButton(JButton button) {
        button.setBackground(PRIMARY);
        button.setForeground(Color.WHITE);
        button.setFont(BUTTON_FONT);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setOpaque(true);
        button.setPreferredSize(new Dimension(140, 45));
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    
    // Style a standard JTextField
    public static void styleTextField(JTextField field) {
        field.setFont(BODY_FONT);
        field.setBackground(TERTIARY_BG);
        field.setForeground(TEXT_PRIMARY);
        field.setBorder(INPUT_BORDER);
        field.setPreferredSize(new Dimension(220, 40));
        field.setCaretColor(PRIMARY);
    }
    
    // Style a standard JPasswordField
    public static void stylePasswordField(JPasswordField field) {
        field.setFont(BODY_FONT);
        field.setBackground(TERTIARY_BG);
        field.setForeground(TEXT_PRIMARY);
        field.setBorder(INPUT_BORDER);
        field.setPreferredSize(new Dimension(220, 40));
        field.setCaretColor(PRIMARY);
    }
    
    // Style a standard JLabel
    public static void styleLabel(JLabel label) {
        label.setFont(BODY_FONT);
        label.setForeground(TEXT_SECONDARY);
    }
    
    // Style a standard JPanel (card)
    public static void styleCard(JPanel panel) {
        panel.setBackground(SECONDARY_BG);
        panel.setBorder(CARD_BORDER);
    }
}