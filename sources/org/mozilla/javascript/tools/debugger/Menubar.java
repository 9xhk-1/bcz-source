package org.mozilla.javascript.tools.debugger;

import io.ktor.util.date.b;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class Menubar extends JMenuBar implements ActionListener {
    private static final long serialVersionUID = 3217170497245911461L;
    private JCheckBoxMenuItem breakOnEnter;
    private JCheckBoxMenuItem breakOnExceptions;
    private JCheckBoxMenuItem breakOnReturn;
    private SwingGui debugGui;
    private List<JMenuItem> interruptOnlyItems = Collections.synchronizedList(new ArrayList());
    private List<JMenuItem> runOnlyItems = Collections.synchronizedList(new ArrayList());
    private JMenu windowMenu;

    public Menubar(SwingGui swingGui) {
        int i11;
        int i12;
        char[] cArr;
        this.debugGui = swingGui;
        String[] strArr = {"Open...", "Run...", "", "Exit"};
        String[] strArr2 = {"Open", "Load", "", "Exit"};
        char[] cArr2 = {'0', 'N', 0, 'X'};
        int[] iArr = {79, 78, 0, 81};
        String[] strArr3 = {"Cut", "Copy", "Paste", "Go to function..."};
        char[] cArr3 = {'T', 'C', 'P', 'F'};
        String[] strArr4 = {"Break", "Go", "Step Into", "Step Over", "Step Out"};
        char[] cArr4 = {'B', 'G', 'I', 'O', 'T'};
        String[] strArr5 = {"Metal", "Windows", "Motif"};
        char[] cArr5 = {b.f62001g, 'W', 'F'};
        int[] iArr2 = {19, 116, 122, 118, 119, 0, 0};
        JMenu jMenu = new JMenu("File");
        jMenu.setMnemonic('F');
        JMenu jMenu2 = new JMenu("Edit");
        jMenu2.setMnemonic('E');
        JMenu jMenu3 = new JMenu("Platform");
        jMenu3.setMnemonic('P');
        JMenu jMenu4 = new JMenu("Debug");
        jMenu4.setMnemonic('D');
        JMenu jMenu5 = new JMenu("Window");
        this.windowMenu = jMenu5;
        jMenu5.setMnemonic('W');
        int i13 = 0;
        while (true) {
            if (i13 >= 4) {
                break;
            }
            if (strArr[i13].length() == 0) {
                jMenu.addSeparator();
                i12 = i13;
                cArr = cArr2;
            } else {
                i12 = i13;
                cArr = cArr2;
                JMenuItem jMenuItem = new JMenuItem(strArr[i12], cArr[i12]);
                jMenuItem.setActionCommand(strArr2[i12]);
                jMenuItem.addActionListener(this);
                jMenu.add(jMenuItem);
                int i14 = iArr[i12];
                if (i14 != 0) {
                    jMenuItem.setAccelerator(KeyStroke.getKeyStroke(i14, 2));
                }
            }
            i13 = i12 + 1;
            cArr2 = cArr;
        }
        int i15 = 0;
        for (i11 = 4; i15 < i11; i11 = 4) {
            JMenuItem jMenuItem2 = new JMenuItem(strArr3[i15], cArr3[i15]);
            jMenuItem2.addActionListener(this);
            jMenu2.add(jMenuItem2);
            i15++;
        }
        for (int i16 = 0; i16 < 3; i16++) {
            JMenuItem jMenuItem3 = new JMenuItem(strArr5[i16], cArr5[i16]);
            jMenuItem3.addActionListener(this);
            jMenu3.add(jMenuItem3);
        }
        for (int i17 = 0; i17 < 5; i17++) {
            JMenuItem jMenuItem4 = new JMenuItem(strArr4[i17], cArr4[i17]);
            jMenuItem4.addActionListener(this);
            int i18 = iArr2[i17];
            if (i18 != 0) {
                jMenuItem4.setAccelerator(KeyStroke.getKeyStroke(i18, 0));
            }
            if (i17 != 0) {
                this.interruptOnlyItems.add(jMenuItem4);
            } else {
                this.runOnlyItems.add(jMenuItem4);
            }
            jMenu4.add(jMenuItem4);
        }
        JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Break on Exceptions");
        this.breakOnExceptions = jCheckBoxMenuItem;
        jCheckBoxMenuItem.setMnemonic('X');
        this.breakOnExceptions.addActionListener(this);
        this.breakOnExceptions.setSelected(false);
        jMenu4.add(this.breakOnExceptions);
        JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem("Break on Function Enter");
        this.breakOnEnter = jCheckBoxMenuItem2;
        jCheckBoxMenuItem2.setMnemonic('E');
        this.breakOnEnter.addActionListener(this);
        this.breakOnEnter.setSelected(false);
        jMenu4.add(this.breakOnEnter);
        JCheckBoxMenuItem jCheckBoxMenuItem3 = new JCheckBoxMenuItem("Break on Function Return");
        this.breakOnReturn = jCheckBoxMenuItem3;
        jCheckBoxMenuItem3.setMnemonic('R');
        this.breakOnReturn.addActionListener(this);
        this.breakOnReturn.setSelected(false);
        jMenu4.add(this.breakOnReturn);
        add(jMenu);
        add(jMenu2);
        add(jMenu4);
        JMenu jMenu6 = this.windowMenu;
        JMenuItem jMenuItem5 = new JMenuItem("Cascade", 65);
        jMenu6.add(jMenuItem5);
        jMenuItem5.addActionListener(this);
        JMenu jMenu7 = this.windowMenu;
        JMenuItem jMenuItem6 = new JMenuItem("Tile", 84);
        jMenu7.add(jMenuItem6);
        jMenuItem6.addActionListener(this);
        this.windowMenu.addSeparator();
        JMenu jMenu8 = this.windowMenu;
        JMenuItem jMenuItem7 = new JMenuItem("Console", 67);
        jMenu8.add(jMenuItem7);
        jMenuItem7.addActionListener(this);
        add(this.windowMenu);
        updateEnabled(false);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        String str;
        String actionCommand = actionEvent.getActionCommand();
        if (actionCommand.equals("Metal")) {
            str = "javax.swing.plaf.metal.MetalLookAndFeel";
        } else if (actionCommand.equals("Windows")) {
            str = "com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
        } else {
            if (!actionCommand.equals("Motif")) {
                Object source = actionEvent.getSource();
                JCheckBoxMenuItem jCheckBoxMenuItem = this.breakOnExceptions;
                if (source == jCheckBoxMenuItem) {
                    this.debugGui.dim.setBreakOnExceptions(jCheckBoxMenuItem.isSelected());
                    return;
                }
                JCheckBoxMenuItem jCheckBoxMenuItem2 = this.breakOnEnter;
                if (source == jCheckBoxMenuItem2) {
                    this.debugGui.dim.setBreakOnEnter(jCheckBoxMenuItem2.isSelected());
                    return;
                }
                JCheckBoxMenuItem jCheckBoxMenuItem3 = this.breakOnReturn;
                if (source == jCheckBoxMenuItem3) {
                    this.debugGui.dim.setBreakOnReturn(jCheckBoxMenuItem3.isSelected());
                    return;
                } else {
                    this.debugGui.actionPerformed(actionEvent);
                    return;
                }
            }
            str = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
        }
        try {
            UIManager.setLookAndFeel(str);
            SwingUtilities.updateComponentTreeUI(this.debugGui);
            SwingUtilities.updateComponentTreeUI(this.debugGui.dlg);
        } catch (Exception unused) {
        }
    }

    public void addFile(String str) {
        boolean z11;
        int i11;
        int itemCount = this.windowMenu.getItemCount();
        if (itemCount == 4) {
            this.windowMenu.addSeparator();
            itemCount++;
        }
        JMenuItem item = this.windowMenu.getItem(itemCount - 1);
        if (item == null || !item.getText().equals("More Windows...")) {
            z11 = false;
            i11 = 5;
        } else {
            z11 = true;
            i11 = 6;
        }
        if (!z11 && itemCount - 4 == 5) {
            JMenu jMenu = this.windowMenu;
            JMenuItem jMenuItem = new JMenuItem("More Windows...", 77);
            jMenu.add(jMenuItem);
            jMenuItem.setActionCommand("More Windows...");
            jMenuItem.addActionListener(this);
            return;
        }
        if (itemCount - 4 <= i11) {
            if (z11) {
                itemCount--;
                this.windowMenu.remove(item);
            }
            String shortName = SwingGui.getShortName(str);
            JMenu jMenu2 = this.windowMenu;
            StringBuilder sb2 = new StringBuilder();
            int i12 = itemCount + 44;
            sb2.append((char) i12);
            sb2.append(" ");
            sb2.append(shortName);
            JMenuItem jMenuItem2 = new JMenuItem(sb2.toString(), i12);
            jMenu2.add(jMenuItem2);
            if (z11) {
                this.windowMenu.add(item);
            }
            jMenuItem2.setActionCommand(str);
            jMenuItem2.addActionListener(this);
        }
    }

    public JCheckBoxMenuItem getBreakOnEnter() {
        return this.breakOnEnter;
    }

    public JCheckBoxMenuItem getBreakOnExceptions() {
        return this.breakOnExceptions;
    }

    public JCheckBoxMenuItem getBreakOnReturn() {
        return this.breakOnReturn;
    }

    public JMenu getDebugMenu() {
        return getMenu(2);
    }

    public void updateEnabled(boolean z11) {
        for (int i11 = 0; i11 != this.interruptOnlyItems.size(); i11++) {
            this.interruptOnlyItems.get(i11).setEnabled(z11);
        }
        for (int i12 = 0; i12 != this.runOnlyItems.size(); i12++) {
            this.runOnlyItems.get(i12).setEnabled(!z11);
        }
    }
}
