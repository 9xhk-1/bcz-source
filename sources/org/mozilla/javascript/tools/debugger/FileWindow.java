package org.mozilla.javascript.tools.debugger;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JScrollPane;
import javax.swing.text.BadLocationException;
import org.mozilla.javascript.tools.debugger.Dim;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class FileWindow extends JInternalFrame implements ActionListener {
    private static final long serialVersionUID = -6212382604952082370L;
    int currentPos;
    private SwingGui debugGui;
    private FileHeader fileHeader;

    /* renamed from: p, reason: collision with root package name */
    private JScrollPane f78408p;
    private Dim.SourceInfo sourceInfo;
    FileTextArea textArea;

    public FileWindow(SwingGui swingGui, Dim.SourceInfo sourceInfo) {
        super(SwingGui.getShortName(sourceInfo.url()), true, true, true, true);
        this.debugGui = swingGui;
        this.sourceInfo = sourceInfo;
        updateToolTip();
        this.currentPos = -1;
        FileTextArea fileTextArea = new FileTextArea(this);
        this.textArea = fileTextArea;
        fileTextArea.setRows(24);
        this.textArea.setColumns(80);
        this.f78408p = new JScrollPane();
        this.fileHeader = new FileHeader(this);
        this.f78408p.setViewportView(this.textArea);
        this.f78408p.setRowHeaderView(this.fileHeader);
        setContentPane(this.f78408p);
        pack();
        updateText(sourceInfo);
        this.textArea.select(0);
    }

    private void updateToolTip() {
        int i11 = 1;
        int componentCount = getComponentCount() - 1;
        if (componentCount <= 1) {
            if (componentCount < 0) {
                return;
            } else {
                i11 = componentCount;
            }
        }
        JComponent component = getComponent(i11);
        if (component == null || !(component instanceof JComponent)) {
            return;
        }
        component.setToolTipText(getUrl());
    }

    public void actionPerformed(ActionEvent actionEvent) {
        String actionCommand = actionEvent.getActionCommand();
        if (actionCommand.equals("Cut")) {
            return;
        }
        if (actionCommand.equals("Copy")) {
            this.textArea.copy();
        } else {
            actionCommand.equals("Paste");
        }
    }

    public void clearBreakPoint(int i11) {
        if (this.sourceInfo.breakableLine(i11) && this.sourceInfo.breakpoint(i11, false)) {
            this.fileHeader.repaint();
        }
    }

    public void dispose() {
        this.debugGui.removeWindow(this);
        super.dispose();
    }

    public int getPosition(int i11) {
        try {
            return this.textArea.getLineStartOffset(i11);
        } catch (BadLocationException unused) {
            return -1;
        }
    }

    public String getUrl() {
        return this.sourceInfo.url();
    }

    public boolean isBreakPoint(int i11) {
        return this.sourceInfo.breakableLine(i11) && this.sourceInfo.breakpoint(i11);
    }

    public void load() {
        String url = getUrl();
        if (url != null) {
            RunProxy runProxy = new RunProxy(this.debugGui, 2);
            runProxy.fileName = url;
            runProxy.text = this.sourceInfo.source();
            new Thread(runProxy).start();
        }
    }

    public void select(int i11, int i12) {
        int length = this.textArea.getDocument().getLength();
        this.textArea.select(length, length);
        this.textArea.select(i11, i12);
    }

    public void setBreakPoint(int i11) {
        if (this.sourceInfo.breakableLine(i11) && this.sourceInfo.breakpoint(i11, true)) {
            this.fileHeader.repaint();
        }
    }

    public void setPosition(int i11) {
        this.textArea.select(i11);
        this.currentPos = i11;
        this.fileHeader.repaint();
    }

    public void toggleBreakPoint(int i11) {
        if (isBreakPoint(i11)) {
            clearBreakPoint(i11);
        } else {
            setBreakPoint(i11);
        }
    }

    public void updateText(Dim.SourceInfo sourceInfo) {
        this.sourceInfo = sourceInfo;
        String source = sourceInfo.source();
        if (!this.textArea.getText().equals(source)) {
            this.textArea.setText(source);
            int i11 = this.currentPos;
            if (i11 == -1) {
                i11 = 0;
            }
            this.textArea.select(i11);
        }
        this.fileHeader.update();
        this.fileHeader.repaint();
    }
}
