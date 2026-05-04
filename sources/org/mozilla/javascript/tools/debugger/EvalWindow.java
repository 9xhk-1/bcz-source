package org.mozilla.javascript.tools.debugger;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class EvalWindow extends JInternalFrame implements ActionListener {
    private static final long serialVersionUID = -2860585845212160176L;
    private EvalTextArea evalTextArea;

    public EvalWindow(String str, SwingGui swingGui) {
        super(str, true, false, true, true);
        EvalTextArea evalTextArea = new EvalTextArea(swingGui);
        this.evalTextArea = evalTextArea;
        evalTextArea.setRows(24);
        this.evalTextArea.setColumns(80);
        setContentPane(new JScrollPane(this.evalTextArea));
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent actionEvent) {
        String actionCommand = actionEvent.getActionCommand();
        if (actionCommand.equals("Cut")) {
            this.evalTextArea.cut();
        } else if (actionCommand.equals("Copy")) {
            this.evalTextArea.copy();
        } else if (actionCommand.equals("Paste")) {
            this.evalTextArea.paste();
        }
    }

    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        this.evalTextArea.setEnabled(z11);
    }
}
