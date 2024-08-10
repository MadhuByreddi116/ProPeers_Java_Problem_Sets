let arr =[1,2,3,4,5];
let k = 8;
let i=0;
while (i<arr.length )
    {
    if(k==arr[i])
    {
        console.log(`Element found at Index  ${i}`);
        break;
    }
    else{
        i++;
    }

    if(i==arr.length)
    {
        console.log('Element not Found');

    }
    
    }