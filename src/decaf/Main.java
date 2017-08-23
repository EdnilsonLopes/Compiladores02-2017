package decaf;

import java.io.*;
<<<<<<< HEAD
//import antlr.Token;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
=======
import antlr.Token;
>>>>>>> 3a3bbef0c9cd090694cf5061dea9d9e857f1cac7
import java6035.tools.CLI.*;

class Main {
    public static void main(String[] args) {
        try {
        	CLI.parse (args, new String[0]);
<<<<<<< HEAD

=======
        	
>>>>>>> 3a3bbef0c9cd090694cf5061dea9d9e857f1cac7
        	InputStream inputStream = args.length == 0 ?
                    System.in : new java.io.FileInputStream(CLI.infile);

        	if (CLI.target == CLI.SCAN)
        	{
<<<<<<< HEAD
        		DecafLexer lexer = new DecafLexer(new ANTLRInputStream(inputStream));
=======
        		DecafScanner lexer = new DecafScanner(new DataInputStream(inputStream));
>>>>>>> 3a3bbef0c9cd090694cf5061dea9d9e857f1cac7
        		Token token;
        		boolean done = false;
        		while (!done)
        		{
        			try
        			{
<<<<<<< HEAD
		        		for (token=lexer.nextToken(); token.getType()!=Token.EOF; token=lexer.nextToken())
		        		{
		        			String type = "";
		        			String text = token.getText();

		        			switch (token.getType())
		        			{
		        			case DecafLexer.ID:
		        				type = " IDENTIFIER";
		        				break;
						case DecafLexer.CHAR:
		        				type = " CHARLITERAL";
		        				break;
						case DecafLexer.STRING:
		        				type = " STRING";
		        				break;
		        			}
	
=======
		        		for (token=lexer.nextToken(); token.getType()!=DecafParserTokenTypes.EOF; token=lexer.nextToken())
		        		{
		        			String type = "";
		        			String text = token.getText();
		
		        			switch (token.getType())
		        			{
		        			case DecafScannerTokenTypes.ID:
		        				type = " IDENTIFIER";
		        				break;
		        			}
>>>>>>> 3a3bbef0c9cd090694cf5061dea9d9e857f1cac7
		        			System.out.println (token.getLine() + type + " " + text);
		        		}
		        		done = true;
        			} catch(Exception e) {
        	        	// print the error:
        	            System.out.println(CLI.infile+" "+e);
<<<<<<< HEAD
        	            lexer.skip();
=======
        	            lexer.consume ();
>>>>>>> 3a3bbef0c9cd090694cf5061dea9d9e857f1cac7
        	        }
        		}
        	}
        	else if (CLI.target == CLI.PARSE || CLI.target == CLI.DEFAULT)
        	{
<<<<<<< HEAD
        		DecafLexer lexer = new DecafLexer(new ANTLRInputStream(inputStream));
				CommonTokenStream tokens = new CommonTokenStream(lexer);
        		DecafParser parser = new DecafParser(tokens);
=======
        		DecafScanner lexer = new DecafScanner(new DataInputStream(inputStream));
        		DecafParser parser = new DecafParser (lexer);
>>>>>>> 3a3bbef0c9cd090694cf5061dea9d9e857f1cac7
                parser.program();
        	}
        	
        } catch(Exception e) {
        	// print the error:
            System.out.println(CLI.infile+" "+e);
        }
    }
}

