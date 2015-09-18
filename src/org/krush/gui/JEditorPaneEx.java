package org.krush.gui;

import java.io.IOException;
import java.io.StringReader;
import javax.swing.text.BadLocationException;
import javax.swing.text.EditorKit;

public class JEditorPaneEx extends javax.swing.JEditorPane {

	public void append(String text) {
		EditorKit editor = this.getEditorKit();
		StringReader reader = new StringReader(text);

		try {
			editor.read(reader, getDocument(), getDocument().getLength());
		} catch (BadLocationException | IOException ex) {
		}

	}
}
