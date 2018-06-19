 
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
 
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
 





class ScoreFrame extends JFrame implements ActionListener, MouseListener {
   
  ScoreDAO scoreDAO;
  ScoreDTO scoreDTO;
   
  JLabel jlName, jlKor, jlEng, jlMat;
  JTextField jtName, jtKor, jtEng, jtMat;
  JButton jbAdd, jbDel, jbChange;
  JTable table;
  Vector data, col;
 
  ScoreFrame() {
    setLayout(null);
    scoreDAO = new ScoreDAO();
 
    // �̸�
    add(jlName = new JLabel("�̸�", JLabel.CENTER));
    jlName.setFont(new Font("���� ���", Font.BOLD, 20));
    jlName.setBorder(BorderFactory.createBevelBorder(0));
    jlName.setBounds(10, 10, 120, 50);
    add(jtName = new JTextField());
    jtName.setFont(new Font("���� ���", Font.BOLD, 20));
    jtName.setHorizontalAlignment(JTextField.CENTER);
    jtName.setBounds(140, 10, 120, 50);
     
    // ����
    add(jlKor = new JLabel("���� ����", JLabel.CENTER));
    jlKor.setFont(new Font("���� ���", Font.BOLD, 20));
    jlKor.setBorder(BorderFactory.createBevelBorder(0));
    jlKor.setBounds(10, 70, 120, 50);
    add(jtKor = new JTextField());
    jtKor.setFont(new Font("���� ���", Font.BOLD, 20));
    jtKor.setHorizontalAlignment(JTextField.CENTER);
    jtKor.setBounds(140, 70, 120, 50);
     
    // ����
    add(jlEng = new JLabel("���� ����", JLabel.CENTER));
    jlEng.setFont(new Font("���� ���", Font.BOLD, 20));
    jlEng.setBorder(BorderFactory.createBevelBorder(0));
    jlEng.setBounds(10, 130, 120, 50);
    add(jtEng = new JTextField());
    jtEng.setFont(new Font("���� ���", Font.BOLD, 20));
    jtEng.setHorizontalAlignment(JTextField.CENTER);
    jtEng.setBounds(140, 130, 120, 50);
     
    // ����
    add(jlMat = new JLabel("���� ����", JLabel.CENTER));
    jlMat.setFont(new Font("���� ���", Font.BOLD, 20));
    jlMat.setBorder(BorderFactory.createBevelBorder(0));
    jlMat.setBounds(10, 190, 120, 50);
    add(jtMat = new JTextField());
    jtMat.setFont(new Font("���� ���", Font.BOLD, 20));
    jtMat.setHorizontalAlignment(JTextField.CENTER);
    jtMat.setBounds(140, 190, 120, 50);
     
    // ��ư
    add(jbAdd = new JButton("�߰�"));
    jbAdd.setFont(new Font("���� ���", Font.BOLD, 20));
    jbAdd.setBounds(270, 10, 120, 50);
    jbAdd.addActionListener(this);
    add(jbDel = new JButton("����"));
    jbDel.setFont(new Font("���� ���", Font.BOLD, 20));
    jbDel.setBounds(270, 70, 120, 50);
    jbDel.addActionListener(this);
    add(jbChange = new JButton("����"));
    jbChange.setFont(new Font("���� ���", Font.BOLD, 20));
    jbChange.setBounds(270, 130, 120, 50);
    jbChange.addActionListener(this);
     
    // �÷� ����
    col = new Vector();
    col.add("�̸�");
    col.add("���� ����");
    col.add("���� ����");
    col.add("���� ����");
    col.add("����");
    col.add("���");
     
    // ���̺� ���� ���ϰ� DefaultTableModel ���
    DefaultTableModel model = new DefaultTableModel(scoreDAO.getScore(), col) {
      public boolean isCellEditable(int row, int column) {
        return false;
      }
    };
     
    /* ����Ʈ���̺��� ���̺� ���ؼ� ��ũ���гο� ���Ѵ� */
    table = new JTable(model);
    table.addMouseListener(this);
    JScrollPane scroll = new JScrollPane(table);
    jTableSet();
    add(scroll);
    scroll.setBounds(415, 10, 770, 250);
     
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    setLocation((screenSize.width - 1200) / 2, (screenSize.height - 300) / 2);
     
    setResizable(false);
    setSize(1200, 300);
    setTitle("���� �������α׷�");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  } // ScoreFrame ������
 
  @Override
  public void actionPerformed(ActionEvent e) {
    String ButtonFlag = e.getActionCommand();
     
    if (ButtonFlag.equals("�߰�")) {
      try {
        contentSet();
        int result = scoreDAO.insertScore(scoreDTO);
        if (result == 1) {
          JOptionPane.showMessageDialog(this, "�߰� �Ǿ����ϴ�.");
          jTableRefresh();
          contentClear();
        } // inner if
      } catch (Exception e2) {
        JOptionPane.showMessageDialog(this, "�̸��� �Է��ϼ���!");
        e2.printStackTrace();
        return;
      } // try - catch
    } else if (ButtonFlag.equals("����")) {
      try {
        contentSet();
        int result = scoreDAO.deleteScore(scoreDTO);
         
        if (result == 1) {
          JOptionPane.showMessageDialog(this, "���� �Ǿ����ϴ�.");
          jTableRefresh();
          contentClear();
        } // inner if
      } catch (Exception e2) {
        JOptionPane.showMessageDialog(this, "�̸��� �Է��ϼ���!");
        e2.printStackTrace();
      } // try - catch
    } else if (ButtonFlag.equals("����")) {
      try {
        contentSet();
        int result = scoreDAO.updateScore(scoreDTO);
         
        if (result == 1) {
          JOptionPane.showMessageDialog(this, "���� �Ǿ����ϴ�.");
          jTableRefresh();
          contentClear();      
          jtName.setFocusable(true);
        } // inner if
      } catch (Exception e2) {
        JOptionPane.showMessageDialog(this, "�̸��� �Է��ϼ���!");
        e2.printStackTrace();
      } // try - catch
    } // if
  } // actionPerformed
   
  @Override
  public void mouseClicked(MouseEvent e) {
    int rowIndex = table.getSelectedRow();
    jtName.setText(table.getValueAt(rowIndex, 0) + "");
    jtKor.setText(table.getValueAt(rowIndex, 1) + "");
    jtEng.setText(table.getValueAt(rowIndex, 2) + "");
    jtMat.setText(table.getValueAt(rowIndex, 3) + "");
  } // mouseClicked
 
  @Override
  public void mousePressed(MouseEvent e) {
  } // mousePressed
 
  @Override
  public void mouseReleased(MouseEvent e) {
  } // mouseReleased
 
  @Override
  public void mouseEntered(MouseEvent e) {
  } // mouseEntered
 
  @Override
  public void mouseExited(MouseEvent e) {
  } // mouseExited
   
  public void jTableRefresh() {
    // ���̺� ���� ���ϰ� DefaultTableModel ���
    DefaultTableModel model = new DefaultTableModel(scoreDAO.getScore(), col) {
      public boolean isCellEditable(int row, int column) {
        return false;
      }
    };
    table.setModel(model);
    jTableSet();
  } // jTableRefresh : ���̺� ������ �����ϴ� �޼���
   
  public void jTableSet() {
    // �̵��� �������� ������ ���� �Ǵ� ���� �����Ѵ�
    table.getTableHeader().setReorderingAllowed(false);
    table.getTableHeader().setResizingAllowed(false);
    table.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
     
    // �÷� ���Ŀ� �ʿ��� �޼���
    DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
    celAlignCenter.setHorizontalAlignment(JLabel.CENTER);
    DefaultTableCellRenderer celAlignRight = new DefaultTableCellRenderer();
    celAlignRight.setHorizontalAlignment(JLabel.RIGHT);
    DefaultTableCellRenderer celAlignLeft = new DefaultTableCellRenderer();
    celAlignLeft.setHorizontalAlignment(JLabel.LEFT);
     
    // �÷��� ������ ���� & ����
    table.getColumnModel().getColumn(0).setPreferredWidth(10);
    table.getColumnModel().getColumn(0).setCellRenderer(celAlignCenter);
    table.getColumnModel().getColumn(1).setPreferredWidth(10);
    table.getColumnModel().getColumn(1).setCellRenderer(celAlignCenter);
    table.getColumnModel().getColumn(2).setPreferredWidth(10);
    table.getColumnModel().getColumn(2).setCellRenderer(celAlignCenter);
    table.getColumnModel().getColumn(3).setPreferredWidth(10);
    table.getColumnModel().getColumn(3).setCellRenderer(celAlignCenter);
    table.getColumnModel().getColumn(4).setPreferredWidth(20);
    table.getColumnModel().getColumn(4).setCellRenderer(celAlignCenter);
    table.getColumnModel().getColumn(5).setPreferredWidth(20);
    table.getColumnModel().getColumn(5).setCellRenderer(celAlignCenter);
  } // jTableRefresh : ���̺� �ɼ� �����ϴ� �޼���
   
  public void contentSet() {
    scoreDTO = new ScoreDTO();
     
    String name = jtName.getText();
    if (name.equals("") || name.equals(null)) JOptionPane.showMessageDialog(this, "�̸��� �Է��ϼ���!");
     
    int kor, eng, mat, tot, ave;
     
    if (jtKor.getText().equals("") || jtKor.getText().equals(null)) {
      kor = 0;
    } else {
      kor = Integer.parseInt(jtKor.getText());
    } // if
    if (jtEng.getText().equals("") || jtEng.getText().equals(null)) {
      eng = 0;
    } else {
      eng = Integer.parseInt(jtEng.getText());
    } // if
    if (jtMat.getText().equals("") || jtMat.getText().equals(null)) {
      mat = 0;
    } else {
      mat = Integer.parseInt(jtMat.getText());
    } // if
    tot = kor + eng + mat;
    ave = tot / 3;
     
    scoreDTO.setName(name);
    scoreDTO.setKor(kor);
    scoreDTO.setEng(eng);
    scoreDTO.setMat(mat);
    scoreDTO.setTot(tot);
    scoreDTO.setAve(ave);
  } // content : �ؽ�Ʈ �ʵ忡 �Էµ� ������ ���ϴ� �޼���
   
  public void contentClear() {
    jtName.setText("");
    jtKor.setText("");
    jtEng.setText("");
    jtMat.setText("");
  } // contentClear : �ؽ�Ʈ �ʵ忡 �Էµ� ������ ����� �޼���
} // ScoreFrame
 
public class Score {
  public static void main(String[] args) {
    new ScoreFrame();
  } // main
} // Score

