var Str = prompt("Enter String");
var count = 0;
for(let i=0; i<Str.length;i++)
{
    if(Str[i]=='a'||Str[i]=='e'||Str[i]=='i'||Str[i]=='o'||Str[i]=='u'||Str[i]=='A'||Str[i]=='E'||Str[i]=='I'||Str[i]=='O'||Str[i]=='U')
    {
        count++;
    }
}
document.write("The total vowels is ="+count);