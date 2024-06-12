Module TryClass
    Sub Main()
        Dim hi As New Mathpo
        Console.WriteLine(hi.Modulus(1,1))
    End Sub
    
    'mathpo class
    Public Class Mathpo
        Dim a As Integer
         'Addition
        Public Function Addition(ByVal num1 As Integer, ByVal num2 As Integer) As Integer
            a = num1 + num2
            Return a
        End Function
        'Multiplication
        Public Function Multiplication(ByVal num1 As Integer, ByVal num2 As Integer) As Integer
            a = num1 * num2
            Return a
        End Function
        'Substraction
        Public Function Substraction(ByVal num1 As Integer, ByVal num2 As Integer) As Integer
            a = num1 - num2
            Return a
        End Function
        'Division
        Public Function Division(ByVal num1 As Integer, ByVal num2 As Integer) As Integer
            a = num1 / num2
            Return a
        End Function
        'Modulus
        Public Function Modulus(ByVal num1 As Integer, ByVal num2 As Integer) As Integer
            a = num1 Mod num2
            Return a
        End Function
    End Class
End Module
