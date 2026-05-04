package org.mozilla.javascript.tools.debugger;

import java.awt.Font;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextArea;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import javax.swing.text.BadLocationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class FileTextArea extends JTextArea implements ActionListener, PopupMenuListener, KeyListener, MouseListener {
    private static final long serialVersionUID = -25032065448563720L;
    private FilePopupMenu popup;

    /* renamed from: w, reason: collision with root package name */
    private FileWindow f78407w;

    public FileTextArea(FileWindow fileWindow) {
        this.f78407w = fileWindow;
        FilePopupMenu filePopupMenu = new FilePopupMenu(this);
        this.popup = filePopupMenu;
        filePopupMenu.addPopupMenuListener(this);
        addMouseListener(this);
        addKeyListener(this);
        setFont(new Font("Monospaced", 0, 12));
    }

    private void checkPopup(MouseEvent mouseEvent) {
        if (mouseEvent.isPopupTrigger()) {
            this.popup.show(this, mouseEvent.getX(), mouseEvent.getY());
        }
    }

    public void actionPerformed(ActionEvent actionEvent) {
        int i11;
        FilePopupMenu filePopupMenu = this.popup;
        int viewToModel = viewToModel(new Point(filePopupMenu.f78405x, filePopupMenu.f78406y));
        this.popup.setVisible(false);
        String actionCommand = actionEvent.getActionCommand();
        try {
            i11 = getLineOfOffset(viewToModel);
        } catch (Exception unused) {
            i11 = -1;
        }
        if (actionCommand.equals("Set Breakpoint")) {
            this.f78407w.setBreakPoint(i11 + 1);
        } else if (actionCommand.equals("Clear Breakpoint")) {
            this.f78407w.clearBreakPoint(i11 + 1);
        } else if (actionCommand.equals("Run")) {
            this.f78407w.load();
        }
    }

    public void keyPressed(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 127) {
            switch (keyCode) {
            }
            return;
        }
        keyEvent.consume();
    }

    public void keyReleased(KeyEvent keyEvent) {
        keyEvent.consume();
    }

    public void keyTyped(KeyEvent keyEvent) {
        keyEvent.consume();
    }

    public void mouseClicked(MouseEvent mouseEvent) {
        checkPopup(mouseEvent);
        requestFocus();
        getCaret().setVisible(true);
    }

    public void mousePressed(MouseEvent mouseEvent) {
        checkPopup(mouseEvent);
    }

    public void mouseReleased(MouseEvent mouseEvent) {
        checkPopup(mouseEvent);
    }

    public void select(int i11) {
        if (i11 >= 0) {
            try {
                int lineOfOffset = getLineOfOffset(i11);
                Rectangle modelToView = modelToView(i11);
                if (modelToView == null) {
                    select(i11, i11);
                    return;
                }
                try {
                    Rectangle modelToView2 = modelToView(getLineStartOffset(lineOfOffset + 1));
                    if (modelToView2 != null) {
                        modelToView = modelToView2;
                    }
                } catch (Exception unused) {
                }
                Rectangle viewRect = getParent().getViewRect();
                if (viewRect.y + viewRect.height > modelToView.y) {
                    select(i11, i11);
                    return;
                }
                modelToView.y += (viewRect.height - modelToView.height) / 2;
                scrollRectToVisible(modelToView);
                select(i11, i11);
            } catch (BadLocationException unused2) {
                select(i11, i11);
            }
        }
    }

    public void mouseEntered(MouseEvent mouseEvent) {
    }

    public void mouseExited(MouseEvent mouseEvent) {
    }

    public void popupMenuCanceled(PopupMenuEvent popupMenuEvent) {
    }

    public void popupMenuWillBecomeInvisible(PopupMenuEvent popupMenuEvent) {
    }

    public void popupMenuWillBecomeVisible(PopupMenuEvent popupMenuEvent) {
    }
}
