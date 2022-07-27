package logico;

import java.text.SimpleDateFormat;

import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class Utilidades {
	
	public static SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
	public static DefaultTableModel model = new DefaultTableModel() {
	    public boolean isCellEditable(int row, int column) {
	       //all cells false
	       return false;
	    }
	};
	
	public static DefaultTableModel model2 = new DefaultTableModel() {
		
	    public boolean isCellEditable(int row, int column) {
	       //all cells false
	       return false;
	    }
	};
	
	public static DefaultTableModel modelCliente = new DefaultTableModel() {

	    public boolean isCellEditable(int row, int column) {
	       //all cells false
	       return false;
	    }
	};
	
	public static DefaultTableModel modelQueso = new DefaultTableModel() {

	    public boolean isCellEditable(int row, int column) {
	       //all cells false
	       return false;
	    }
	};
	
	public static DefaultTableModel modelFactura = new DefaultTableModel() {

	    public boolean isCellEditable(int row, int column) {
	       //all cells false
	       return false;
	    }
	};
	
	public static MaskFormatter getMascaraCedula() {
		MaskFormatter mascara = null;
		try {
			mascara = new MaskFormatter("###-#######-#");
			mascara.setPlaceholderCharacter('_');
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mascara;
	}
	
	public static MaskFormatter getMascaraRNC() {
		MaskFormatter mascara = null;
		try {
			mascara = new MaskFormatter("###########");
			mascara.setPlaceholderCharacter('_');
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mascara;
	}
	
	public static MaskFormatter getMascaraTelefono() {
		MaskFormatter mascara = null;
		try {
			mascara = new MaskFormatter("(###)-###-####");
			mascara.setPlaceholderCharacter('_');
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mascara;
	}

}
