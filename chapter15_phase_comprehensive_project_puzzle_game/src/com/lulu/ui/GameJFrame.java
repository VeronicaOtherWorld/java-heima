package com.lulu.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    int[][] newArr = new int[4][4];
    int[][] winArr = new int[][] {
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,0}
    };
    int step = 0;
    // record the place in the 2d array
    int x, y;
    String path = "chapter15_phase_comprehensive_project_puzzle_game/image/animal/animal3/";

    // create items of the option
    JMenuItem replayItem = new JMenuItem("start again");
    JMenuItem reloginItem = new JMenuItem("relogin");
    JMenuItem exitItem = new JMenuItem("exit");

    JMenuItem helpItem = new JMenuItem("help");

    public GameJFrame() {
        // init whole page
        init();
        // init the menu bar
        initMenuBar();

        // init data
        initData();

        // init pic
        initImg();

        // show the interface
        this.setVisible(true);
    }


    private void initMenuBar() {
        // initial menu
        // create whole menu
        JMenuBar menuBar = new JMenuBar();

        // create two options
        JMenu functionMenu = new JMenu("function");
        JMenu aboutMenu = new JMenu("about");

        // combine the option and items
        functionMenu.add(replayItem);
        functionMenu.add(reloginItem);
        functionMenu.add(exitItem);



        // add to the menu
        menuBar.add(functionMenu);

        aboutMenu.add(helpItem);
        menuBar.add(aboutMenu);
        //  combine the action listen
        replayItem.addActionListener(this);
        reloginItem.addActionListener(this);
        exitItem.addActionListener(this);
        helpItem.addActionListener(this);

        // set the menu to the whole page
        this.setJMenuBar(menuBar);
    }

    private void init() {
        // 1.create a game jframe main page
        // jframe is a javabean class , has attributes and methods
        // also has getter and setter
        this.setSize(603, 680);
        // set title
        this.setTitle("Game V1.0");
        // set z-index
        this.setAlwaysOnTop(true);
        // set the page in the middle of screen
        this.setLocationRelativeTo(null);
        // set close method
        this.setDefaultCloseOperation(3);
        // Cancel the default centering effect
        this.setLayout(null);

        // add keyboard listen
        this.addKeyListener(this);

    }

    // init data
    // depends on the data to init the pic
    private void initData() {
        int[] arr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randNum = rand.nextInt(0, 16);
            int temp = arr[i];
            arr[i] = arr[randNum];
            arr[randNum] = temp;
        }
        // method 2
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                x = i / 4;
                y = i % 4;
            }
            newArr[i / 4][i % 4] = arr[i];
        }
    }

    private void initImg() {
        // delete all
        this.getContentPane().removeAll();
        // if is win
        if (winner()) {
            JLabel winnerLabel = new JLabel(new ImageIcon("chapter15_phase_comprehensive_project_puzzle_game/image/win.png"));
            winnerLabel.setBounds(203,283,197,73);
            this.getContentPane().add(winnerLabel);
        }

        // step
        JLabel stepLabel = new JLabel("step" + step);
        stepLabel.setBounds(50,30,100,20);
        this.getContentPane().add(stepLabel);


        // column 1
        // 4 rows
        for (int i = 0; i < 4; i++) {
            // add pic in a row
            for (int j = 0; j < 4; j++) {
                int num = newArr[i][j];
                //     create imageicon
                ImageIcon icon = new ImageIcon(path + num +".jpg");
                //     create jlable obj
                JLabel imgLabel = new JLabel(icon);
                //     set the bounds of the pic
                imgLabel.setBounds(105 * j + 88,105 * i + 134,105,105);
                // add border
                imgLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //     add jlabel to the page
                this.getContentPane().add(imgLabel);
            }
        }
    //     add backgroud
        ImageIcon backIcon = new ImageIcon("chapter15_phase_comprehensive_project_puzzle_game/image/background.png");
        JLabel backLabel = new JLabel(backIcon);
        backLabel.setBounds(40,40,508,560);
        this.getContentPane().add(backLabel);

    //     refresh page
        this.getContentPane().repaint();
    }

    public boolean winner(){
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                if(newArr[i][j] != winArr[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
    //     pressing
        if(code == 65) {
        //     delete all pics
            this.getContentPane().removeAll();
        //     add whole pic
            JLabel jlabel = new JLabel(new ImageIcon(path + "all.jpg"));
            jlabel.setBounds(83, 134, 420, 420);
            this.getContentPane().add(jlabel);
        //     add background
            ImageIcon backIcon = new ImageIcon("chapter15_phase_comprehensive_project_puzzle_game/image/background.png");
            JLabel backLabel = new JLabel(backIcon);
            backLabel.setBounds(40,40,508,560);
            this.getContentPane().add(backLabel);
        //     refresh
            this.getContentPane().repaint();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
    //     determine if win
        if (winner()) {
            return;
        }
    //     left 37, up 38, right 39 down 40
        int code = e.getKeyCode();
        if (code == 37) {
            if(y == 0){
                return;
            }
            // the space block to left
            newArr[x][y] = newArr[x][y - 1];
            newArr[x][y - 1] = 0;
            y--;
            step++;
            // render page
            initImg();
        }else if (code == 38) {
            if(x == 0){
                return;
            }
            // the space block up
            newArr[x][y] = newArr[x - 1][y];
            newArr[x - 1][y] = 0;
            x--;
            step++;
            // render page
            initImg();
        } else if (code == 39) {
            if(y == 3){
                return;
            }
            // the space block right
            newArr[x][y] = newArr[x][y + 1];
            newArr[x][y + 1] = 0;
            y++;
            step++;
            // render page
            initImg();
        } else if (code == 40) {
            if(x == 3){
                return;
            }
            // the space block up
            newArr[x][y] = newArr[x + 1][y];
            newArr[x + 1][y] = 0;
            x++;
            step++;
            // render page
            initImg();
        //     check the whole pic
        } else if (code == 65) {
            // render page
            initImg();
        //     cheat sheet
        } else if (code == 87) {
            newArr = winArr;
            initImg();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // get the item
        Object item = e.getSource();
        if (item == replayItem){
            System.out.println("replayItem");
            // reset step counter
            step = 0;
            // Shuffle an array
            initData();
            // reload pic
            initImg();
        }else if (item == reloginItem){
            System.out.println("reloginItem");
            // close the page
            this.setVisible(false);
            // open login in
            new LoginJFrame();
        } else if (item == exitItem){
            System.out.println("exitItem");
            System.exit(0);
        } else if (item == helpItem) {
            System.out.println("helpItem");
            JDialog helpDialog = new JDialog();
            JLabel jLabel = new JLabel("sorry we cannot give you any help");
            jLabel.setBounds(0,0,100,100);
            helpDialog.add(jLabel);
            helpDialog.setSize(400,100);
            helpDialog.setAlwaysOnTop(true);
            helpDialog.setLocationRelativeTo(null);
            // not close can not handle the page below
            helpDialog.setModal(true);
            // show
            helpDialog.setVisible(true);
        }


    }
}
