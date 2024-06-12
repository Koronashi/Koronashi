Module VBModule
    Sub Main()
        Dim Str1 As String = "Hello"
        Dim Str2 As String = "Cello"
        Console.WriteLine("The Comparison of String {0} and {1} results {2}.", Str1, Str2, String.Compare(Str1, Str2))
        
        Dim Sdata As String = "WELCOME"
        Dim Sdata2 As String = "welcome"
        Console.WriteLine("The Comparison of String {0} and {1} results {2}.", Sdata, Sdata2, String.Compare(Sdata, Sdata2))
        
        Dim Sdata3 As String = "HELLO"
        Dim Sdata4 As String = "hello"
        Console.WriteLine("The Comparison of String {0} and {1} results {2}.", Sdata3, Sdata4, String.Compare(Sdata3, Sdata4))
        
        Console.WriteLine("Press any key😊.....")
    End Sub
End Module
