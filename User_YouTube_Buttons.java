import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User_YouTube_Buttons
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("User YouTube UI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        frame.setLayout(new BorderLayout());

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());

        JLabel videoLabel = new JLabel("Videos Space", SwingConstants.CENTER);
        videoLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        contentPanel.add(videoLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 6, 10, 10));

        JButton like_Button = new JButton("Like !!!");
        JButton subscribe_Button = new JButton("Subscribe !!!");
        JButton download_Button = new JButton("Download !!!");
        JButton share_Button = new JButton("Share !!!");
        JButton comments_Button = new JButton("Comments !!!");
        JButton more_Button = new JButton("More !!!");

        buttonPanel.add(like_Button);
        buttonPanel.add(subscribe_Button);
        buttonPanel.add(download_Button);
        buttonPanel.add(share_Button);
        buttonPanel.add(comments_Button);
        buttonPanel.add(more_Button);

        frame.add(contentPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);

        like_Button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Clicked -> Like Button !!!");
            }
        });
        subscribe_Button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Clicked -> Subscribe Button !!!");
            }
        });
        download_Button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Clicked -> Download Button !!!");
            }
        });
        share_Button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Clicked -> Share Button !!!");
            }
        });
        comments_Button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Clicked -> Comments Button !!!");
            }
        });
        more_Button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Clicked -> More Button !!! ");
            }
        });
    }
}

