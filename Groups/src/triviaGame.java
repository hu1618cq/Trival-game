
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class triviaGame extends JFrame implements ActionListener {
	//Question 1 instance variables
	private JLabel quest1 = new JLabel("What NFL team won the first Superbowl?");
	private JRadioButton ans1 = new JRadioButton("Giants");
	private JRadioButton ans2 = new JRadioButton("Packers");
	private JRadioButton ans3 = new JRadioButton("Cowboys");
	private JRadioButton ans4 = new JRadioButton("Vikings");
	//Question 2 instance variables
	private JLabel quest2 = new JLabel("What NFL team owned the worst record in 2016-2017?");
	private JRadioButton ans5 = new JRadioButton("Browns");
	private JRadioButton ans6 = new JRadioButton("Bears");
	private JRadioButton ans7 = new JRadioButton("Bengals");
	private JRadioButton ans8 = new JRadioButton("Buccaneers");
	//Question 3 instance variables
	private JLabel quest3 = new JLabel("What movie won Oscar for best picture in 1995?");
	private JRadioButton ans9 = new JRadioButton("The Shawshank Redemption");
	private JRadioButton ans10 = new JRadioButton("Pulp Fiction");
	private JRadioButton ans11 = new JRadioButton("Forrest Gump");
	private JRadioButton ans12 = new JRadioButton("4 Weddings and a Funeral");
	//Question 4 instance variables
	private JLabel quest4 = new JLabel("What Japanese cities did the US bomb in 1942?");
	private JRadioButton ans13 = new JRadioButton("Hiroshima and Nagasaki");
	private JRadioButton ans14 = new JRadioButton("Toyoko and Hiroshima");
	private JRadioButton ans15 = new JRadioButton("Nagasaki and Osaka");
	private JRadioButton ans16 = new JRadioButton("None of the Above");
	//Question 5 instance variables
	private JLabel quest5 = new JLabel("What is the capital of Canada?");
	private JRadioButton ans17 = new JRadioButton("Ontario");
	private JRadioButton ans18 = new JRadioButton("Vancouver");
	private JRadioButton ans19 = new JRadioButton("Ottawa");
	private JRadioButton ans20 = new JRadioButton("Toronto");
	//Button instance variable
	private JButton sub1 = new JButton("Submit");
	
	//output area
	private JTextArea outputArea = new JTextArea();

	//JPanel instance variables
	private JPanel p1 = new JPanel(new FlowLayout(10));
	private JPanel p2 = new JPanel(new FlowLayout(10));
	private JPanel p3 = new JPanel(new FlowLayout(10));
	private JPanel p4 = new JPanel(new FlowLayout(10));
	private JPanel p5 = new JPanel(new FlowLayout(10));
	private JPanel p6 = new JPanel(new FlowLayout(10));
	private JPanel p7 = new JPanel(new FlowLayout(10));
	private JPanel p8 = new JPanel(new FlowLayout(10));
	private JPanel p9 = new JPanel(new FlowLayout(10));
	private JPanel p10 = new JPanel(new FlowLayout(10));
	private JPanel p11 = new JPanel(new FlowLayout());
	private JPanel p12 = new JPanel(new BorderLayout());

	
	private JPanel topPanel = new JPanel(new GridLayout(12, 1));
	private int count = 0;
	
	public int getCount() {
		
		return count;
		
	}

	public void setCount(int count) {
		
		this.count = count;
		
	}

	public triviaGame (){
		
		setTitle("1082 Trivia");
		super.setSize(750, 650);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
		buildPanels();
		
		addPanelsToFrame();
		
		buttonGroup();
		
		addListeners();
	}
//add listener for submit button to function
	private void addListeners() {

		sub1.addActionListener(this);

	}

	private void buttonGroup() {
		
		ButtonGroup group = new ButtonGroup();
		ButtonGroup group2 = new ButtonGroup();
		ButtonGroup group3 = new ButtonGroup();
		ButtonGroup group4 = new ButtonGroup();
		ButtonGroup group5 = new ButtonGroup();
		
		group.add(ans1);
		group.add(ans2);
		group.add(ans3);
		group.add(ans4);
		
		group2.add(ans5);
		group2.add(ans6);
		group2.add(ans7);
		group2.add(ans8);
		
		group3.add(ans9);
		group3.add(ans10);
		group3.add(ans11);
		group3.add(ans12);
		
		group4.add(ans13);
		group4.add(ans14);
		group4.add(ans15);
		group4.add(ans16);
		
		group5.add(ans17);
		group5.add(ans18);
		group5.add(ans19);
		group5.add(ans20);
	}
	
	private void addPanelsToFrame() {
		
		JScrollPane pane = new JScrollPane(outputArea);
		add(topPanel);
		add(pane);
		
	}

	private void buildPanels() {
		p1.add(quest1);
		p2.add(ans1);
		p2.add(ans2);
		p2.add(ans3);
		p2.add(ans4);
		
		
		p3.add(quest2);
		p4.add(ans5);
		p4.add(ans6);
		p4.add(ans7);
		p4.add(ans8);
		
		
		p5.add(quest3);
		p6.add(ans9);
		p6.add(ans10);
		p6.add(ans11);
		p6.add(ans12);
		
		
		p7.add(quest4);
		p8.add(ans13);
		p8.add(ans14);
		p8.add(ans15);
		p8.add(ans16);
		
		p9.add(quest5);
		p10.add(ans17);
		p10.add(ans18);
		p10.add(ans19);
		p10.add(ans20);
		
		p11.add(sub1);
		
		topPanel.add(p1);
		topPanel.add(p2);
		topPanel.add(p3);
		topPanel.add(p4);
		topPanel.add(p5);
		topPanel.add(p6);
		topPanel.add(p7);
		topPanel.add(p8);
		topPanel.add(p9);
		topPanel.add(p10);
		topPanel.add(p11);
			
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Question 1
		if (ans2.isSelected()){
	
			outputArea.append("Question 1 is Correct!\n");

			count++;
		
		} else{
		
			outputArea.append("Question 1 is Wrong!\n" );

		}
		//Question 2
		if (ans5.isSelected()){
		
			outputArea.append("Question 2 is Correct!\n");

			count++;
		
		}else{
		
			outputArea.append("Question 2 is Wrong\n" );

		}
		//Question 3		
		if (ans11.isSelected()){
		
			outputArea.append("Question 3 is Correct!\n");

			count++;
		
		}else{
		
			outputArea.append("Question 3 is Wrong!\n" );

		}
		//Question 4	
		if (ans16.isSelected()){
		
			outputArea.append("Question 4 is Correct!\n");

			count++;
		
		}else{
			
			outputArea.append("Question 4 is Wrong!\n" );

		}
		//Question 5
		if (ans19.isSelected()){
			
			outputArea.append("Question 5 is Correct!\n");

			count++;
		
		}else{
			
			outputArea.append("Question 5 is Wrong!\n" );

		}	
		//Output
		
		outputArea.append("Your Total Score is: " + count + " Points\n" );

// need a break here so the user can try again

	}
		
	public static void main (String[]args){
		
		triviaGame trivial = new triviaGame ();
		
		trivial.setVisible(true);
	}
	
}
	