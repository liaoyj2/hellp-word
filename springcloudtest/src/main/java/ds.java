import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.delete.Delete;
import net.sf.jsqlparser.statement.insert.Insert;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.statement.select.SelectBody;
import net.sf.jsqlparser.statement.update.Update;
import net.sf.jsqlparser.util.TablesNamesFinder;

import java.util.List;

public class ds {


    public static void main(String[] args) throws JSQLParserException {
        Statement statement = CCJSqlParserUtil.parse("UPDATE customers\n" +
                "SET phone_number = '555-1234', email = 'johndoe@example.com'\n" +
                "WHERE customer_name = 'John Doe';");
        Update selectStatement = (Update) statement;
        TablesNamesFinder tablesNamesFinder = new TablesNamesFinder();
        List<String> tableList = tablesNamesFinder.getTableList(selectStatement);

        System.out.println(tableList);
    }

}
