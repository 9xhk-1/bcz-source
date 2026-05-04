package org.mozilla.javascript.tools.debugger;

import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class FilePopupMenu extends JPopupMenu {
    private static final long serialVersionUID = 3589525009546013565L;

    /* renamed from: x, reason: collision with root package name */
    int f78405x;

    /* renamed from: y, reason: collision with root package name */
    int f78406y;

    public FilePopupMenu(FileTextArea fileTextArea) {
        JMenuItem jMenuItem = new JMenuItem("Set Breakpoint");
        add(jMenuItem);
        jMenuItem.addActionListener(fileTextArea);
        JMenuItem jMenuItem2 = new JMenuItem("Clear Breakpoint");
        add(jMenuItem2);
        jMenuItem2.addActionListener(fileTextArea);
        JMenuItem jMenuItem3 = new JMenuItem("Run");
        add(jMenuItem3);
        jMenuItem3.addActionListener(fileTextArea);
    }

    public void show(JComponent jComponent, int i11, int i12) {
        this.f78405x = i11;
        this.f78406y = i12;
        super.show(jComponent, i11, i12);
    }
}
